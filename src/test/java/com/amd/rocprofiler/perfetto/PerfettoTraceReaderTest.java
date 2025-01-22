package com.amd.rocprofiler.perfetto;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class PerfettoTraceReaderTest {

    @Test
    public void testReadTraceFile() {
        String traceFilePath = "src/test/resources/trace_file.pb";

        try {
            PerfettoTraceReader.main(new String[]{traceFilePath});
            assertTrue(true, "Trace file parsed successfully.");
        } catch (Exception e) {
            fail("Failed to parse trace file: " + e.getMessage());
        }
    }
}
