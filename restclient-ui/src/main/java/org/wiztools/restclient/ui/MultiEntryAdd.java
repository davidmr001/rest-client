package org.wiztools.restclient.ui;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Subhash
 */
interface MultiEntryAdd {
    public void add(Map<String, String> keyValuePair, List<String> invalidLines);
}
