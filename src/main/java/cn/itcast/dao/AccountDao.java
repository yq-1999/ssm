package cn.itcast.dao;

import cn.itcast.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * 帐户dao接口  mybatis只需我们写dao接口就行，实现类不需要写，mybatis会自动生成代理对象
 */

@Repository("accountDao")
public interface AccountDao {


    @Select("select * from account")
    // 查询所有账户
    public List<Account> findAll();

    // 保存帐户信息
    @Insert("insert into account (name,money) values (#{name},#{money})")
    public void saveAccount(Account account);

}
