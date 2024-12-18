package store.view;

public class OutputView {

    private final String WELCOME_MESSAGE = "안녕하세요. W편의점입니다.";
    private final String PRODUCT_LIST_MESSAGE = "현재 보유하고 있는 상품입니다.";

    public void startStore() {
        System.out.println(WELCOME_MESSAGE);
        System.out.println(PRODUCT_LIST_MESSAGE);
    }
}
