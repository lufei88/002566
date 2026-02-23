package com.github.catvod.spider.p000mergexbpq.S;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class c<Key1, Key2, Value> {
    Map<Key1, Map<Key2, Value>> a = new LinkedHashMap();

    /* renamed from: ۤۧۥۢ, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m1473(Object obj) {
        if (C0018.m3956() >= 0) {
            return ((c) obj).a;
        }
        return null;
    }

    public final Value a(Key1 key1, Key2 key2) {
        Map map = (Map) C0038.m6401(m1473(this), key1);
        if (map == null) {
            return null;
        }
        return (Value) C0062.m9431(map, key2);
    }

    public final Value b(Key1 key1, Key2 key2, Value value) {
        Value value2;
        Object linkedHashMap = (Map) C0038.m6401(m1473(this), key1);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            C0006.m1755(m1473(this), key1, linkedHashMap);
            value2 = null;
        } else {
            value2 = (Value) C0062.m9431(linkedHashMap, key2);
        }
        C0006.m1755(linkedHashMap, key2, value);
        return value2;
    }
}