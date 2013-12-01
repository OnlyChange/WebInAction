package cn.lmn.web.user;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import cn.lmn.service.IUserService;
import cn.lmn.vo.UserVo;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
@Results(
			@Result(name="list",type="redirect",location="user.action")
		)
public class UserAction extends ActionSupport implements ModelDriven<UserVo>{
	private static final long serialVersionUID = 8741402944779210334L;
	private UserVo userVo = new UserVo();
	private IUserService userService;
	@Override
	public String execute() throws Exception {
		userVo.setUserList(userService.query(null, null));
		return SUCCESS;
	}

	@Override
	public UserVo getModel() {
		return userVo;
	}

	public UserVo getUserVo() {
		return userVo;
	}
	@Resource
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	
}
