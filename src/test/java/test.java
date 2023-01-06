import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

public class test {
    @RunWith(Parameterized.class) // Напиши аннотацию для параметризованных тестов
    public static class CheckIsAdultTest {

        private final int age;
        private final boolean result;

        public CheckIsAdultTest(int age, boolean result) {
            this.age = age;
            this.result = result;// Инициализируй поля класса в конструкторе
        }

        @Parameterized.Parameters// Пометь метод аннотацией для параметров
        public static Object[][] getTextData() {
            return new Object[][] {
                    {17, false},
                    {18, true},
                    {19, true},
                    {21, true},

                    // Заполни массив тестовыми данными и ожидаемым результатом
            };
        }

        @Test
        public void checkIsAdultWhenAgeThenResult() {
            Program program = new Program();
            int age = this.age; // Передай сюда возраст пользователя
            boolean isAdult = program.checkIsAdult (age);
            // Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
            assertEquals("Ожидается другой результат проверки", result, isAdult);
        }
    }
}
