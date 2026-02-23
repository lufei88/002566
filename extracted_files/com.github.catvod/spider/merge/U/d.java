package com.github.catvod.spider.merge.U;

import com.github.catvod.spider.merge.q.C0058;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class d extends LinkedHashMap {
    public d() {
        super(100, 0.75f, true);
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return C0058.m9073(this) > 100;
    }
}