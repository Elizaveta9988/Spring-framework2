package task1;
public class MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringConfig.class};//где находится спринг конфигурация
    }

    protected String[] getServletMappings() {
        return new String[]{"/"}; //все запросы от пользователя отправляем на диспетчекр сервлет/ dct http запросы пользователя оправляем надиспетчер сервлет
    }

    @Override
    public void onStartup(ServletContext aServletContext) throws ServletException {
        super.onStartup(aServletContext);
        registerHiddenFieldFilter(aServletContext);
    }

    private void registerHiddenFieldFilter(ServletContext aContext) {
        aContext.addFilter("hiddenHttpMethodFilter",
                new HiddenHttpMethodFilter()).addMappingForUrlPatterns(null ,true, "/*");
    }
}