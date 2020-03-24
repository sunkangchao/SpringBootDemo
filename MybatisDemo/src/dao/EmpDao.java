package dao;

import domain.Dept;
import domain.Emp;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface EmpDao {



    //设计一个方法，通过empno查询员工的个人信息和部门信息。
    @Results(value={@Result(property = "empno",column = "empno",id = true),
            @Result(property = "ename",column = "ename"),
            @Result(property = "job",column = "job"),
            @Result(property = "mgr",column = "mgr"),
            @Result(property = "hiredate",column = "hiredate"),
            @Result(property = "sal",column = "sal"),
            @Result(property = "comm",column = "comm"),
            @Result(property = "dept",javaType = Dept.class,column = "deptno",one = @One(select = "selectByDeptno"))
    })
    @Select("select * from emp where empno=#{empno}")
    public Emp selectOne(int empno);

    @Select("select * from dept where deptno=#{deptno}")
    public Dept selectByDeptno(int deptno);
}
