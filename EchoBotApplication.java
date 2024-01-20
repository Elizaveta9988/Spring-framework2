@SpringBootApplication
public class EchoBotApplication {

    public static void main(String[] args) {
        SpringApplication.run(EchoBotApplication.class, args);

        try {
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            String botToken = "test";
            telegramBotsApi.registerBot(new TelegramBot(botToken));
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
}