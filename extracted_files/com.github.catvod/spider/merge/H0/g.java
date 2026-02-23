package com.github.catvod.spider.merge.H0;

import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.q.C0058;

/* loaded from: classes.dex */
public final class g extends com.github.catvod.spider.merge.Z0.a {
    public static final g a = new g();

    @Override // com.github.catvod.spider.merge.Z0.a
    public final boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : C0058.m9103(obj, obj2);
    }

    @Override // com.github.catvod.spider.merge.Z0.a
    public final int b(Object obj) {
        if (obj == null) {
            return 0;
        }
        return C0050.m8087(obj);
    }
}