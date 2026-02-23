package com.github.catvod.spider.p000mergexbpq.e0;

import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.c0.e;
import com.github.catvod.spider.p000mergexbpq.c0.i;
import com.github.catvod.spider.p000mergexbpq.c0.l;
import com.github.catvod.spider.p000mergexbpq.c0.r;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import java.util.Iterator;

/* renamed from: com.github.catvod.spider.merge-xbpq.e0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0142z extends N {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f343short = {1924, 2011, 2003, 1998, 1994, 1991};

    /* renamed from: ۣ۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static short[] m2742() {
        if (C0035.m6140() <= 0) {
            return f343short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.e0.N
    public final boolean a(l lVar, l lVar2) {
        Iterator itM3109 = C0013.m3109(C0039.m6562(lVar2));
        while (C0012.m2962(itM3109)) {
            r rVar = (r) C0048.m7949(itM3109);
            if (!(rVar instanceof e) && !(rVar instanceof i)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return C0064.m9599(m2742(), 0, 6, 1982);
    }
}