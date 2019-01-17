/**
 *  UserService TODO()
 */
package cn.smbms.service;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.smbms.pojo.User;
import cn.smbms.tools.Page;

/**
 * @author ggy
 *
 */
public interface UserService {
	
	/**
	 * findByName TODO(通过名称获取用户对象)
	 * @param name
	 * @return
	 */
	User findByName(String name);
	
	/**
	 * saveUser TODO(添加用户信息)
	 * @param user
	 * @return
	 */
	Integer saveUser(User user);
	
	/**
	 * findByPage TODO(查询数据+分页)
	 * @param map
	 * @return
	 */
	Page<User> findByPage(Map<String, Object> map);
	
	/**
	 * delectUser TODO(删除用户信息)
	 * @param id
	 * @return
	 */
	Integer delectUser(Integer id);
	
	/**
	 * updateUser TODO(用户修改)
	 * @param user
	 * @return
	 */
	Integer updateUser(User user);
	
	/**
	 * findByid TODO(通过ID获取用户信息)
	 * @param id
	 * @return
	 */
	User findByid(Integer id);
	
	/**
	 * UpdatePwd TODO(修改密码)
	 * @return
	 */
	Integer updatePwd(User user);
	
}	
