package service;

import dao.EmpDao;
import domain.Emp;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class EmpService {
    EmpDao dao = new SqlSessionFactoryBuilder().build(Thread.currentThread().getContextClassLoader().getResourceAsStream("configuration.xml")).openSession(true).getMapper(EmpDao.class);

    public Emp selectOne(int empno){
        return dao.selectOne(empno);
    }
}
