package net.imain.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * spring mvc 异常处理步骤：
 *      1. 定义一个自己的异常类（SysException）实现 Exception, 并添加一个自己的 message 属性（setter 和 getter）
 *      2. 定义一个全局异常类（SysExceptionResolver） 实现 HandlerExceptionResolver 接口, 并实现方法
 *          * 判断这个异常是系统异常还是自定义异常：
 *              * 如果是自己的就让实现的方法中的 Exception e 参数 = 自己定义的异常类对象
 *              * 否则重新 new 一个自己的异常类, 自定义异常消息
 *      3. 设置好转向参数以及路径, 然后return
 *      4. 在 spring-mvc.xml 文件中配置 全局异常类（SysExceptionResolver） 的bean, 不需要 id 号
 */
public class SysExceptionResolver implements HandlerExceptionResolver {
    public ModelAndView resolveException(HttpServletRequest httpServletRequest,
                                         HttpServletResponse httpServletResponse, Object o, Exception e) {

        // 先判断如果该异常是系统异常
        SysException sysException = null;

        // 如果是自己写的异常则让异常对象 = 自己抛出的
        if (e instanceof SysException) {
            sysException = (SysException) e;
        } else {    // 否则为系统异常, 抛出 "未知错误"
            String error = e.getMessage();
            sysException = new SysException("未知错误: [ " + error + " ]");
        }

        // 错误信息
        String message = sysException.getMessage();

        ModelAndView view = new ModelAndView();

        // 将错误消息转到页面
        view.addObject("message", message);

        /* 转向的页面的名字以及路径 */
        view.setViewName("/error/-1/-1");  // 在 webapp 下创建一个jsp文件夹, 里面建一个 error.jsp

        return view;
    }
}
