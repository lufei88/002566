package com.github.catvod.spider.merge.l0;

import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class g extends HashMap {
    public final /* synthetic */ j a;

    public g(j jVar) {
        this.a = jVar;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        C0053.m8424(C0012.m2951(C0006.m1727(this)), str == null ? str : C0023.m4587(str), str2);
        return (String) super.put(str, str2);
    }
}