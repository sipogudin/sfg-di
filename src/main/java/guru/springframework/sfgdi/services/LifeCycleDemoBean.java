package guru.springframework.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    public LifeCycleDemoBean() {
        System.out.println("## I'm in the LifeCycleDemoBean constructor");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("## I'm in the setBeanName method             --- BeanNameAware");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## I'm in the setBeanFactory method          --- BeanFactoryAware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## I'm in the setApplicationContext method   --- ApplicationContextAware");
    }

    public void beforeInit(){
        System.out.println("## - Before Init - Called by Bean Post Processor");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("## I'm in the postConstruct annotated method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## I'm in the afterPropertiesSet method      --- InitializingBean");
    }

    public void afterInit(){
        System.out.println("## - After init called by Bean Post Processor");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("## I'm in the the preDestroy annotated method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## I'm in the destroy method                 --- DisposableBean");
    }
}
