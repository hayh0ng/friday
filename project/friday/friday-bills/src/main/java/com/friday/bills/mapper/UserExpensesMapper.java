package com.friday.bills.mapper;

import com.friday.bills.entity.UserExpenses;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (UserExpenses)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-23 15:16:45
 */
public interface UserExpensesMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param expensesId 主键
     * @return 实例对象
     */
    UserExpenses queryById(Integer expensesId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UserExpenses> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param userExpenses 实例对象
     * @return 对象列表
     */
    List<UserExpenses> queryAll(UserExpenses userExpenses);

    /**
     * 新增数据
     *
     * @param userExpenses 实例对象
     * @return 影响行数
     */
    int insert(UserExpenses userExpenses);

    /**
     * 修改数据
     *
     * @param userExpenses 实例对象
     * @return 影响行数
     */
    int update(UserExpenses userExpenses);

    /**
     * 通过主键删除数据
     *
     * @param expensesId 主键
     * @return 影响行数
     */
    int deleteById(Integer expensesId);

}