package org.dromara.soul.common.dto.convert;

import lombok.Getter;
import lombok.Setter;
import org.dromara.soul.common.constant.Constants;

/**
 * this is hystrix handle.
 *
 * @author xiaoyu(Myth)
 */
@Getter
@Setter
public class HystrixHandle {

    /**
     * hystrix group key is required.
     * 分组Key
     */
    private String groupKey;

    /**
     * hystrix command key is required.
     * 命令Key
     */
    private String commandKey;

    /**
     * hystrix withExecutionIsolationSemaphoreMaxConcurrentRequests.
     *
     * 最大并发量
     */
    private int maxConcurrentRequests = Constants.MAX_CONCURRENT_REQUESTS;

    /**
     * hystrix withCircuitBreakerErrorThresholdPercentage.
     * 错误半分比阀值

     */
    private int errorThresholdPercentage = Constants.ERROR_THRESHOLD_PERCENTAGE;

    /**
     * hystrix withCircuitBreakerRequestVolumeThreshold.
     * 跳闸最小请求数量
     */
    private int requestVolumeThreshold = Constants.REQUEST_VOLUME_THRESHOLD;

    /**
     * hystrix withCircuitBreakerSleepWindowInMilliseconds.
     * 跳闸休眠时间
     */
    private int sleepWindowInMilliseconds = Constants.SLEEP_WINDOW_INMILLISECONDS;

    /**
     * timeout is required.
     * 超时时间
     */
    private Integer timeout = Constants.TIME_OUT;
}
