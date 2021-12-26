import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class InjectMocksTest {

	@Mock
	private A a;

	@Mock
	private B b;

	@InjectMocks
	private ClassWithConstructor classWithConstructor;

	@BeforeEach
	void init() {
		when(a.toString()).thenReturn("mock of A");
		when(b.toString()).thenReturn("mock of B");
	}

	@Test
	void test() {
		System.out.println(classWithConstructor.getA());
		System.out.println(classWithConstructor.getB());
	}

}
