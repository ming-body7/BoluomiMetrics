package com.boluomi.metrics.impl;

import com.boluomi.metrics.DataMetricsWriter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class DataMetricsWriterImpl implements DataMetricsWriter {

    static Log log = LogFactory.getLog(DataMetricsWriter.class);


    private Map<String, String> logEntries = new HashMap<>();

    @Override
    public void addProperty(String key, String value) {
        logEntries.put(key, value);
    }

    @Override
    public void write() {
        log.info(new JSONObject(logEntries).toString());
    }
}
