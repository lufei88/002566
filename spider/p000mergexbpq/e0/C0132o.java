package com.github.catvod.spider.p000mergexbpq.e0;

import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.c0.l;
import java.util.regex.Pattern;

/* renamed from: com.github.catvod.spider.merge-xbpq.e0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0132o extends N {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f333short = {543, 609, 567, 570, 633, 609, 567, 537};
    String a;
    Pattern b;

    public C0132o(String str, Pattern pattern) {
        this.a = C0056.m8869(str);
        this.b = pattern;
    }

    /* renamed from: ۣ۟ۢۡۥ, reason: not valid java name and contains not printable characters */
    public static String m2716(Object obj) {
        if (C0063.m9589() < 0) {
            return ((C0132o) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۤۡۦۢ, reason: not valid java name and contains not printable characters */
    public static Pattern m2717(Object obj) {
        if (C0024.m4693() < 0) {
            return ((C0132o) obj).b;
        }
        return null;
    }

    /* renamed from: ۣ۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static short[] m2718() {
        if (C0055.m8740() > 0) {
            return f333short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.e0.N
    public final boolean a(l lVar, l lVar2) {
        return C0040.m6638(lVar2, m2716(this)) && C0003.m1405(C0034.m6026(m2717(this), C0058.m9094(lVar2, m2716(this))));
    }

    public final String toString() {
        return C0002.m1327(C0064.m9599(m2718(), 0, 8, 580), new Object[]{m2716(this), C0010.m2391(m2717(this))});
    }
}