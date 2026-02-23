package com.github.catvod.spider.merge.Z;

import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class d {
    public final int a;
    public final String b;
    public final Map c;

    public d() {
        this.a = 500;
        this.b = C0007.m1840();
        this.c = new HashMap();
    }

    public d(int i, String str, Map map) {
        this.a = i;
        this.b = str;
        this.c = map;
    }

    public final String a() {
        String strM8004 = C0049.m8004(this);
        return C0043.m7327(strM8004) ? C0007.m1840() : strM8004;
    }
}