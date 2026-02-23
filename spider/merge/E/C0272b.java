package com.github.catvod.spider.merge.e;

import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.github.catvod.spider.merge.e.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0272b extends C0281k implements Map {
    public C0271a h;

    @Override // java.util.Map
    public final Set entrySet() {
        if (C0011.m2795(this) == null) {
            this.h = new C0271a(0, this);
        }
        C0271a c0271aM2795 = C0011.m2795(this);
        if (C0043.m7287(c0271aM2795) == null) {
            c0271aM2795.a = new C0278h(c0271aM2795, 0);
        }
        return C0043.m7287(c0271aM2795);
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (C0011.m2795(this) == null) {
            this.h = new C0271a(0, this);
        }
        C0271a c0271aM2795 = C0011.m2795(this);
        if (C0024.m4707(c0271aM2795) == null) {
            c0271aM2795.b = new C0278h(c0271aM2795, 1);
        }
        return C0024.m4707(c0271aM2795);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int iM6428 = C0038.m6428(map) + C0042.m7150(this);
        int iM7150 = C0042.m7150(this);
        int[] iArrM1306 = C0002.m1306(this);
        if (iArrM1306.length < iM6428) {
            Object[] objArrM2126 = C0009.m2126(this);
            C0063.m9559(this, iM6428);
            if (C0042.m7150(this) > 0) {
                C0062.m9384(iArrM1306, 0, C0002.m1306(this), 0, iM7150);
                C0062.m9384(objArrM2126, 0, C0009.m2126(this), 0, iM7150 << 1);
            }
            C0054.m8606(iArrM1306, objArrM2126, iM7150);
        }
        if (C0042.m7150(this) != iM7150) {
            throw new ConcurrentModificationException();
        }
        Iterator itM5199 = C0029.m5199(C0058.m9142(map));
        while (C0012.m2962(itM5199)) {
            Map.Entry entry = (Map.Entry) C0048.m7949(itM5199);
            C0005.m1666(this, C0045.m7624(entry), C0039.m6540(entry));
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (C0011.m2795(this) == null) {
            this.h = new C0271a(0, this);
        }
        C0271a c0271aM2795 = C0011.m2795(this);
        if (C0006.m1756(c0271aM2795) == null) {
            c0271aM2795.c = new C0280j(c0271aM2795);
        }
        return C0006.m1756(c0271aM2795);
    }
}