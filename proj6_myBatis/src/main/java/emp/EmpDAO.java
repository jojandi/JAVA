package emp;

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
	public List<EmpDTO> selectEmp() {
		List<EmpDTO> empList = null;

		// SqlMapComfig.xml을 읽어옴
		sqlMapper = getInstance();

		if (sqlMapper != null) {
			// DB 접속
			SqlSession sqlSession = sqlMapper.openSession();

			// 실행 -> namespace.id
			// selectList -> List로 담아줌
			empList = sqlSession.selectList("mapper.emp.selectAllEmp");
		} else {
			System.out.println("DB 접속 실패");
		}

		return empList;
	}

	// 전체count 하기
	public int selectTotalEmp() {
		int total = -1;

		// SqlMapConfig.xml을 읽어옴
		sqlMapper = getInstance();
		if (sqlMapper != null) {
			// DB 접속
			SqlSession sqlSession = sqlMapper.openSession();

			try {
				total = (int) sqlSession.selectOne("mapper.emp.selectTotalEmp");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("DB 접속 실패");
		}

		return total;
	}

	// empno = 7788에 맞는 ename 가져와서 String에 담기
	public String selectEnameEmp() {
		String ename = null;

		// SqlMapConfig.xml을 읽어옴
		sqlMapper = getInstance();
		if (sqlMapper != null) {
			// DB 접속
			SqlSession sqlSession = sqlMapper.openSession();

			try {
				ename = sqlSession.selectOne("mapper.emp.selectEnameEmp");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("DB 접속 실패");
		}

		return ename;
	}

	// empno = 7788에 맞는 ename, sal, empno DTO로 받기
	public EmpDTO selectOneEmp() {
		EmpDTO empDTO = null;

		// SqlMapConfig.xml을 읽어옴
		sqlMapper = getInstance();
		if (sqlMapper != null) {
			// DB 접속
			SqlSession sqlSession = sqlMapper.openSession();

			try {
				empDTO = (EmpDTO) sqlSession.selectOne("mapper.emp.selectOneEmp");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("DB 접속 실패");
		}

		return empDTO;
	}

	// 전체 조회 후 map에 담기
	public List<Map> selectAllEmpMap() {
		List<Map> map = null;

		sqlMapper = getInstance();
		if (sqlMapper != null) {
			// DB 접속
			SqlSession sqlSession = sqlMapper.openSession();

			map = sqlSession.selectList("mapper.emp.selectAllEmpMap");
			System.out.println("empList.size : " + map.size());
		} else {
			System.out.println("DB 접속 실패");
		}

		return map;
	}

	// empno 조건 받아서 ename과 sal 업데이트
	public int updateEmp(EmpDTO empDTO) {
		int result = -1;

		// SqlMapConfig.xml을 읽어옴
		sqlMapper = getInstance();
		if (sqlMapper != null) {
			// DB 접속
			// 자동 커밋 : SqlSession sqlSession = sqlMapper.openSession();
			// 수동 커밋 : SqlSession sqlSession = sqlMapper.openSession(false);
			SqlSession sqlSession = sqlMapper.openSession(false);

			try {
				result = (int) sqlSession.update("mapper.emp.updateEmp", empDTO);
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
	
	
	// 전달인자 받아서 where 조건 채우기
	public EmpDTO selectEmpByEname(String ename) {
		EmpDTO empDTO = null;

		// SqlMapConfig.xml을 읽어옴
		sqlMapper = getInstance();
		if (sqlMapper != null) {
			// DB 접속
			SqlSession sqlSession = sqlMapper.openSession();

			try {
				empDTO = sqlSession.selectOne("mapper.emp.selectEmpByEname", ename);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("DB 접속 실패");
		}

		return empDTO;
	}
}
