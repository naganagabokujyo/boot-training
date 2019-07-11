package com.example.training.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.training.constant.ViewNameEnum;
import com.example.training.dto.EmpDetailInfo;
import com.example.training.dto.EmpSearchInfo;
import com.example.training.service.EmpListSevice;


@Controller
@RequestMapping(value = "/empList")
@SessionAttributes(value = "empSearchInfo")
public class EmpListController  {

	@Autowired
	private EmpListSevice empListSeviceImpl;

	@ModelAttribute("empSearchInfo")
	EmpSearchInfo setEmpSearchInfo(EmpSearchInfo empSearchInfo) {
        return empSearchInfo;
    }


	/**
	 * 検索画面初期表示
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/init")
	public String searchInit(Model model) {
		EmpSearchInfo e = new EmpSearchInfo();
		model.addAttribute("empSearchInfo", e);
		return ViewNameEnum.SEARCH.getValue();
	}


	/**
	 * 検索処理
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/search")
	public String search(@ModelAttribute EmpSearchInfo empSearchInfo, Model model) {

		// 検索チェック
		empSearchInfo = empListSeviceImpl.searchCheck(empSearchInfo);
		// エラーメッセージが存在する場合は、検索を実行せず検索画面にエラーメッセージを表示する。
		if (!empSearchInfo.getErrMessages().isEmpty()) {
			// モデルに設定
			model.addAttribute("empSearchInfo", empSearchInfo);
			return ViewNameEnum.SEARCH.getValue();
		}

		// 検索実行
		EmpSearchInfo result =  empListSeviceImpl.findEmpList(empSearchInfo);
		// 画面から渡ってきた、empSearchInfoのempListInfoの内容を再設定する。
		// モデルに設定
		model.addAttribute("empSearchInfo", result);
		// セッションに格納
		setEmpSearchInfo(result);
		return ViewNameEnum.SEARCH.getValue();

	}

	/**
	 * 詳細画面遷移処理
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/goDetail")
	public String goDetail(@RequestParam("empId") String empId, @ModelAttribute EmpSearchInfo empSearchInfo,
			SessionStatus sessionStatus, RedirectAttributes redirectAttributes, Model model) {

		// 検索
		Map<String, Object> result =  empListSeviceImpl.findEmpDetail(empId);
		// 検索結果がない場合、一覧に画面を表示
		if (result.containsKey("errMessages")) {
			empSearchInfo.setErrMessages((Map<String, Object>)result.get("errMessages"));
			setEmpSearchInfo(empSearchInfo);
			return ViewNameEnum.SEARCH.getValue();
		}

		EmpDetailInfo info = (EmpDetailInfo) result.get("result");

		redirectAttributes.addFlashAttribute("empDetailInfo", info);

		sessionStatus.isComplete();

		return "redirect:/empDetail/init";

	}

}