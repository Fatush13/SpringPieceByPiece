import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TextEditorConfig {
    @Bean
    public SpellChecker spellChecker() {
        return new SpellChecker();
    }

    @Bean
    public TextEditor textEditor() {
        return new TextEditor(spellChecker());
    }
}
