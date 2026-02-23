package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a1.C0043;

/* renamed from: com.github.catvod.spider.merge.F0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0168z {
    public final InterfaceC0167y[] a;
    public final int b;

    public C0168z(InterfaceC0167y[] interfaceC0167yArr) {
        this.a = interfaceC0167yArr;
        int iM5632 = 0;
        for (InterfaceC0167y interfaceC0167y : interfaceC0167yArr) {
            iM5632 = C0031.m5632(iM5632, interfaceC0167y);
        }
        this.b = C0043.m7334(iM5632, interfaceC0167yArr.length);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0168z)) {
            return false;
        }
        C0168z c0168z = (C0168z) obj;
        return C0040.m6598(this) == C0040.m6598(c0168z) && C0037.m6347(C0037.m6357(this), C0037.m6357(c0168z));
    }

    public final int hashCode() {
        return C0040.m6598(this);
    }
}