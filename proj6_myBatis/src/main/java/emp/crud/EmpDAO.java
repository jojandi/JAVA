package emp.crud;

import java.io.Reader;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class EmpDAO {
	private SqlSessionFactory sqlMapper = null;

	// SqlMapComfig.xml을 읽고 DB를 접속하는 매소드
	public SqlSessionFactory getInstance() {
		if (sqlMapper == null) {
			try {
				String res = "mybatis/SqlMapConfig.xml";
				Reader reader = Resources.getResourceAsReader(res); // 파일 읽기

				SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
				sqlMapper = ssfb.build(reader);

				reader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return sqlMapper;
	}

	// 전체 테이블 조회
//	public List<EmpDTO> selectEmp() {
//		List<EmpDTO> empList = null;
//
//		// SqlMapComfig.xml을 읽어옴
//		sqlMapper = getInstance();
//
//		if (sqlMapper != null) {
//			// DB 접속
//			SqlSession sqlSession = sqlMapper.openSession();
//
//			// 실행 -> namespace.id
//			// selectList -> List로 담아줌
//			empList = sqlSession.selectList("mapper.emp.selectAllEmp");
//		} else {
//			System.out.println("DB 접속 실패");
//		}
//
//		return empList;
//	}
	
	public EmpDTO selectEmpno(int empno) {
		EmpDTO dto = null;

		// SqlMapComfig.xml을 읽어옴
		sqlMapper = getInstance();

		if (sqlMapper != null) {
			// DB 접속
			SqlSession sqlSession = sqlMapper.openSession();

			dto = sqlSession.selectOne("mapper.emp.param.selectOneEmp", empno);
		} else {
			System.out.println("DB 접속 실패");
		}

		return dto;
	}

	// empno, ename, hireDate 인서트
	public int insertEmp(EmpDTO empDTO) {
		int result = -1;

		// SqlMapConfig.xml을 읽어옴
		sqlMapper = getInstance();
		if (sqlMapper != null) {
			// DB 접속
			// 자동 커밋 : SqlSession sqlSession = sqlMapper.openSession(true);
			// 수동 커밋 : SqlSession sqlSession = sqlMapper.openSession(false);
			SqlSession sqlSession = sqlMapper.openSession(false);

			try {
				result = sqlSession.insert("mapper.emp.param.insertEmp", empDTO);
				sqlSession.commit(); // 강제로 커밋시킴
			} catch (Exception e) {
				sqlSession.rollback(); // 실패 시 롤백
				e.printStackTrace();
			}
		} else {
			System.out.println("DB 접속 실패");
		}

		return result;
	}
	
	// empno, ename, hireDate 업데이트
	public int updateEmp(EmpDTO empDTO) {
		int result = -1;

		// SqlMapConfig.xml을 읽어옴
		sqlMapper = getInstance();
		if (sqlMapper != null) {
			// DB 접속
			// 자동 커밋 : SqlSession sqlSession = sqlMapper.openSession(true);
			// 수동 커밋 : SqlSession sqlSession = sqlMapper.openSession(false);
			SqlSession sqlSession = sqlMapper.openSession(false);

			try {
				result = sqlSession.update("mapper.emp.param.updateEmp", empDTO);
				sqlSession.commit(); // 강제로 커밋시킴
			} catch (Exception e) {
				sqlSession.rollback(); // 실패 시 롤백
				e.printStackTrace();
			}
		} else {
			System.out.println("DB 접속 실패");
		}

		return result;
	}
	
	public int deleteEmp(int empno) {
		int result = -1;

		// SqlMapConfig.xml을 읽어옴
		sqlMapper = getInstance();
		if (sqlMapper != null) {
			// DB 접속
			// 자동 커밋 : SqlSession sqlSession = sqlMapper.openSession(true);
			// 수동 커밋 : SqlSession sqlSession = sqlMapper.openSession(false);
			SqlSession sqlSession = sqlMapper.openSession(false);

			try {
				result = sqlSession.delete("mapper.emp.param.deleteEmp", empno);
				sqlSession.commit(); // 강제로 커밋시킴
			} catch (Exception e) {
				sqlSession.rollback(); // 실패 시 롤백
				e.printStackTrace();
			}
		} else {
			System.out.println("DB 접속 실패");
		}

		return result;
	}
	
	
	// 전체 테이블 조회 및 검색
	public List<EmpDTO> selectEmp(EmpDTO dto) {
		List<EmpDTO> empList = null;
		
		// SqlMapComfig.xml을 읽어옴
		sqlMapper = getInstance();
		
		if (sqlMapper != null) {
			// DB 접속
			SqlSession sqlSession = sqlMapper.openSession();
			
			// 실행 -> namespace.id
			// selectList -> List로 담아줌
			empList = sqlSession.selectList("mapper.emp.dynamic.selectEmpList", dto);
		} else {
			System.out.println("DB 접속 실패");
		}
		
		return empList;
	}
	
}
