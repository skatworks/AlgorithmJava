package jp.co.solver.java.Algorithm;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Before;
import org.junit.Test;

public class BasicTest {

	private Basic basic;

	@Before
	public void setUp() throws Exception {
		basic = new Basic();
	}

	@Test
	public void getMaxIn3_すべて同じ値0の場合() {
		assertThat(basic.getMaxIn3(0, 0, 0), is(0));
	}

	@Test
	public void getMaxIn3_すべて同じ値1の場合() {
		assertThat(basic.getMaxIn3(1, 1, 1), is(1));
	}

	@Test
	public void getMaxIn3_異なる値123の場合() {
		assertThat(basic.getMaxIn3(1, 2, 3), is(3));
	}

	@Test
	public void getMaxIn3_異なる値112の場合() {
		assertThat(basic.getMaxIn3(1, 1, 2), is(2));
	}

	@Test
	public void getMidIn3_すべて同じ値0の場合() {
		assertThat(basic.getMidIn3(0, 0, 0), is(0));
	}

	@Test
	public void getMidIn3_すべて同じ値1の場合() {
		assertThat(basic.getMidIn3(1, 1, 1), is(1));
	}

	@Test
	public void getMidIn3_異なる値112の場合() {
		assertThat(basic.getMidIn3(1, 1, 2), is(1));
	}

	@Test
	public void getMidIn3_異なる値123の場合() {
		assertThat(basic.getMidIn3(1, 2, 3), is(2));
	}
}
