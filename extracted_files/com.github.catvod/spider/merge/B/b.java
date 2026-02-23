package com.github.catvod.spider.merge.B;

import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class b {
    public final int a;
    public final Method b;

    public b(Method method, int i) throws SecurityException {
        this.a = i;
        this.b = method;
        C0016.m3602(method, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return C0004.m1527(this) == C0004.m1527(bVar) && C0007.m1815(C0040.m6634(C0015.m3475(this)), C0040.m6634(C0015.m3475(bVar)));
    }

    public final int hashCode() {
        return C0054.m8590(C0040.m6634(C0015.m3475(this))) + (C0004.m1527(this) * 31);
    }
}