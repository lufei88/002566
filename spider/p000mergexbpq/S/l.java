package com.github.catvod.spider.p000mergexbpq.S;

import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class l<A, B> implements Serializable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f162short = {3124, 3129, 3183, 3120, 3132, 3129, 3183, 3125};
    public final A c;
    public final B d;

    public l(A a, B b) {
        this.c = a;
        this.d = b;
    }

    /* renamed from: ۣ۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static short[] m1481() {
        if (C0002.m1242() > 0) {
            return f162short;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        Object objM7489 = C0044.m7489(this);
        Object objM74892 = C0044.m7489(lVar);
        if (objM7489 == null ? objM74892 == null : C0058.m9103(objM7489, objM74892)) {
            Object objM5399 = C0030.m5399(this);
            Object objM53992 = C0030.m5399(lVar);
            if (objM5399 == null ? objM53992 == null : C0058.m9103(objM5399, objM53992)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C0044.m7505(C0027.m5036(C0027.m5036(0, C0044.m7489(this)), C0030.m5399(this)), 2);
    }

    public final String toString() {
        return C0002.m1327(C0024.m4740(m1481(), 0, 8, 3100), new Object[]{C0044.m7489(this), C0030.m5399(this)});
    }
}