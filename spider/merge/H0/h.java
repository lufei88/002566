package com.github.catvod.spider.merge.H0;

import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class h implements Serializable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f453short = {447, 434, 484, 443, 439, 434, 484, 446};
    public final Object a;
    public final Object b;

    public h(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    /* renamed from: ۟ۦۧۥۧ, reason: not valid java name and contains not printable characters */
    public static short[] m4140() {
        if (C0016.m3596() <= 0) {
            return f453short;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        Object objM1698 = C0006.m1698(hVar);
        Object objM16982 = C0006.m1698(this);
        if (objM16982 == null ? objM1698 == null : C0058.m9103(objM16982, objM1698)) {
            Object objM3170 = C0013.m3170(this);
            Object objM31702 = C0013.m3170(hVar);
            if (objM3170 == null ? objM31702 == null : C0058.m9103(objM3170, objM31702)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C0043.m7334(C0031.m5632(C0031.m5632(0, C0006.m1698(this)), C0013.m3170(this)), 2);
    }

    public final String toString() {
        return C0002.m1327(C0037.m6307(m4140(), 0, 8, 407), new Object[]{C0006.m1698(this), C0013.m3170(this)});
    }
}