package com.miotech.kun.data.collect.extract;

import com.miotech.kun.data.collect.models.Table;
import org.json.JSONObject;

/**
 * Extractor Definition
 */
public interface Extractor {
    Table extract();
}
