package org.vitoliu.common.metrics.metric;

/**
 *
 * @author yukun.liu
 * @since 04 一月 2019
 */
public interface Gauge extends MetricItem<Double>{

	Double getValue();
}
