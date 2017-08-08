package net.imain.exception;

/**
 * 切记是继承 RuntimeException , 否则不会被捕获, 事务不会回滚.
 */
public class SysException extends RuntimeException {
    private String message;

    public SysException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
