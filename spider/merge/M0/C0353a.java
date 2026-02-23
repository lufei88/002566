package com.github.catvod.spider.merge.m0;

import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import java.io.Serializable;

/* renamed from: com.github.catvod.spider.merge.m0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0353a implements Serializable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f839short = {959, 924, 912, 914, 927, 979, 899, 914, 897, 903, 979, 925, 924, 903, 979, 914, 927, 927, 924, 900, 918, 919, 979, 903, 924, 979, 913, 918, 979, 925, 902, 927, 927, 2009, 2571};
    public final String a;
    public final String b;
    public final String c;

    public C0353a(String str, String str2) {
        this(str, str2, C0007.m1840());
    }

    public C0353a(String str, String str2, String str3) {
        String str4 = str3;
        String str5 = str;
        if (str2 == null) {
            throw new IllegalArgumentException(C0031.m5565(m8852(), 0, 33, 1011));
        }
        String strM1840 = C0007.m1840();
        str5 = str5 == null ? strM1840 : str5;
        str4 = str4 == null ? strM1840 : str4;
        this.a = str5;
        this.b = str2;
        this.c = str4;
    }

    /* renamed from: ۣۣ۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static short[] m8852() {
        if (C0001.m1164() < 0) {
            return f839short;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0353a)) {
            return false;
        }
        C0353a c0353a = (C0353a) obj;
        return C0007.m1815(C0019.m4130(this), C0019.m4130(c0353a)) && C0007.m1815(C0042.m7185(this), C0042.m7185(c0353a));
    }

    public final int hashCode() {
        return C0054.m8590(C0042.m7185(this)) ^ C0054.m8590(C0019.m4130(this));
    }

    public final String toString() {
        String strM1840 = C0007.m1840();
        String strM7185 = C0042.m7185(this);
        boolean zM1815 = C0007.m1815(strM7185, strM1840);
        String strM4130 = C0019.m4130(this);
        if (zM1815) {
            return strM4130;
        }
        StringBuffer stringBuffer = new StringBuffer(C0063.m9585(m8852(), 33, 1, 1954));
        C0051.m8251(stringBuffer, strM7185);
        C0051.m8251(stringBuffer, C0038.m6452(m8852(), 34, 1, 2678));
        C0051.m8251(stringBuffer, strM4130);
        return C0058.m9069(stringBuffer);
    }
}