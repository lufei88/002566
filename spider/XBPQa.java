package com.github.catvod.spider;

import android.content.SharedPreferences;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.j.j;

/* loaded from: classes.dex */
public final /* synthetic */ class XBPQa implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f122short = {21964, 31527, 31512, -25540, 26886, -29311, 21025};
    public final /* synthetic */ XBPQ c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    public /* synthetic */ XBPQa(XBPQ xbpq, String str, String str2) {
        this.c = xbpq;
        this.d = str;
        this.e = str2;
    }

    /* renamed from: ۟ۥۢۥۡ, reason: not valid java name and contains not printable characters */
    public static short[] m741() {
        if (C0058.m9131() <= 0) {
            return f122short;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final XBPQ xbpqM9597 = C0063.m9597(this);
        String strM1779 = C0006.m1779(this);
        String strM3973 = C0018.m3973(this);
        C0047.m7785();
        C0047.m7777(xbpqM9597);
        C0027.m5038(C0037.m6307(m741(), 0, 7, 1097), strM1779, strM3973, new j() { // from class: com.github.catvod.spider.XBPQ.1

            /* renamed from: short */
            private static final short[] f117short = {2767, 2767, 2767, 3096, 3168, 3096, 3168, 3096, 3168, 3179, 2601, 2563, 2583, 2976};

            AnonymousClass1() {
            }

            /* renamed from: ۟ۢۧ۟ۡ */
            public static short[] m714() {
                if (C0005.m1599() <= 0) {
                    return f117short;
                }
                return null;
            }

            /* renamed from: ۣ۟ۧ۟۠ */
            public static XBPQ m715(Object obj) {
                if (C0004.m1557() <= 0) {
                    return XBPQ.this;
                }
                return null;
            }

            /* renamed from: ۟ۤ۟ۥۥ */
            public static String m716(Object obj, Object obj2) {
                if (C0025.m4797() < 0) {
                    return null;
                }
                return ((XBPQ) obj).A = (String) obj2;
            }

            /* renamed from: ۢۨ۠ۤ */
            public static String m717(Object obj) {
                if (C0054.m8557() < 0) {
                    return XBPQ.m657((XBPQ) obj);
                }
                return null;
            }

            /* renamed from: ۣۤۡۢ */
            public static SharedPreferences m718() {
                if (C0042.m7147() <= 0) {
                    return Init.d;
                }
                return null;
            }

            /* renamed from: ۣۤۨۨ */
            public static String m719(Object obj, Object obj2) {
                if (C0008.m1975() < 0) {
                    return null;
                }
                return ((XBPQ) obj).z = (String) obj2;
            }

            @Override // com.github.catvod.spider.p000mergexbpq.j.j
            public void vertifyCode(String str) {
                if (C0059.m9178(str, C0051.m8259(m714(), 0, 3, 2795)) > 1) {
                    String[] strArrM4752 = C0024.m4752(str, C0052.m8337(m714(), 3, 6, 3140));
                    String str2 = strArrM4752[0];
                    String strM6307 = C0037.m6307(m714(), 9, 1, 3144);
                    XBPQ.K = C0024.m4752(str2, strM6307)[0];
                    m719(m715(this), C0024.m4752(strArrM4752[0], strM6307)[1]);
                    SharedPreferences.Editor editorM8069 = C0050.m8069(m718());
                    C0043.m7324(editorM8069, C0040.m6629(new StringBuilder(), m717(m715(this)), C0040.m6584(m714(), 10, 3, 2678)), C0024.m4752(strArrM4752[0], strM6307)[0]);
                    C0043.m7324(editorM8069, m717(m715(this)), C0024.m4752(strArrM4752[0], strM6307)[1]);
                    C0049.m7994(editorM8069);
                }
                m716(m715(this), C0047.m7833(m714(), 13, 1, 2960));
            }
        });
    }
}