public class TelegramBot extends TelegramLongPollingBot {

    public TelegramBot(String botToken) {
        super(botToken);
    }


    @Override
    public String getBotUsername() {
        return "super_simple_echo_bot";
    }

    @Override
    public void onUpdateReceived(Update update) {

        if (update.hasMessage() && update.getMessage().hasText()) {
            SendMessage message = new SendMessage();
            message.setChatId(update.getMessage().getChatId().toString());
            message.setText(update.getMessage().getText());

            try {
                execute(message);
                log.debug(update.getMessage().getChat().getUserName() + ": " + message.getText());
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }
}public class TelegramBot extends TelegramLongPollingBot {

    public TelegramBot(String botToken) {
        super(botToken);
    }


    @Override
    public String getBotUsername() {
        return "super_simple_echo_bot";
    }

    @Override
    public void onUpdateReceived(Update update) {

        if (update.hasMessage() && update.getMessage().hasText()) {
            SendMessage message = new SendMessage();
            message.setChatId(update.getMessage().getChatId().toString());
            message.setText(update.getMessage().getText());

            try {
                execute(message);
                log.debug(update.getMessage().getChat().getUserName() + ": " + message.getText());
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }
}public class TelegramBot extends TelegramLongPollingBot {

    public TelegramBot(String botToken) {
        super(botToken);
    }


    @Override
    public String getBotUsername() {
        return "super_simple_echo_bot";
    }

    @Override
    public void onUpdateReceived(Update update) {

        if (update.hasMessage() && update.getMessage().hasText()) {
            SendMessage message = new SendMessage();
            message.setChatId(update.getMessage().getChatId().toString());
            message.setText(update.getMessage().getText());

            try {
                execute(message);
                log.debug(update.getMessage().getChat().getUserName() + ": " + message.getText());
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }
}