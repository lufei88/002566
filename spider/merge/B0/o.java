package com.github.catvod.spider.merge.b0;

import android.R;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Scroller;
import com.github.catvod.spider.Notice;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f0.C0300c;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f756short = {1368, 1368, 1368, 1368, 1368, 1368, 1368, 1368, 1368, 1368, 1368, 1368, 1368, 1368, 1368, 1368, 1368, 1368, 1368, 1368, 1368, 1368, 1368, 1368, 1368, 1368, 1368, 1368, 1368, 1368, 1368, 1368, 1368, 1368, 1368, 1368, 1368, 1368, 1368, 1368};
    public final /* synthetic */ int a;
    public final /* synthetic */ Notice b;

    public /* synthetic */ o(Notice notice, int i) {
        this.a = i;
        this.b = notice;
    }

    /* renamed from: ۡۨۡۥ, reason: not valid java name and contains not printable characters */
    public static short[] m7534() {
        if (C0052.m8320() > 0) {
            return f756short;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Notice noticeM4254 = C0020.m4254(this);
        int i = 1;
        switch (C0059.m9236(this)) {
            case 0:
                C0047.m7777(noticeM4254);
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < 2; i2++) {
                    C0018.m3933(sb, C0002.m1305(m7534(), 0, 40, 1400));
                    C0018.m3933(sb, C0022.m4423(noticeM4254));
                }
                C0300c c0300c = new C0300c(C0031.m5652());
                noticeM4254.a = c0300c;
                C0039.m6563(c0300c, 20.0f);
                C0300c c0300cM3090 = C0013.m3090(noticeM4254);
                c0300cM3090.b = C0054.m8630(noticeM4254);
                C0042.m7106(c0300cM3090, C0047.m7763(sb));
                C0041.m6804(C0013.m3090(noticeM4254), null, 1);
                C0016.m3608(C0013.m3090(noticeM4254), 0, C0013.m3103(16), 0, C0013.m3103(16));
                C0048.m7907(C0013.m3090(noticeM4254), C0042.m7113(200, 255, 255, 255));
                C0300c c0300cM30902 = C0013.m3090(noticeM4254);
                Scroller scrollerM7840 = C0047.m7840(c0300cM30902);
                int i3 = -C0037.m6344(c0300cM30902);
                TextPaint textPaintM4754 = C0024.m4754(c0300cM30902);
                Rect rect = new Rect();
                String strM2774 = C0011.m2774(C0023.m4571(c0300cM30902));
                C0028.m5159(textPaintM4754, strM2774, 0, C0004.m1584(strM2774), rect);
                C0023.m4592(scrollerM7840, i3, 0, C0037.m6344(c0300cM30902) + C0022.m4424(rect), 0, C0009.m2131(c0300cM30902) * 1000);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 48;
                C0300c c0300cM30903 = C0013.m3090(noticeM4254);
                C0062.m9425();
                try {
                    C0041.m6790((ViewGroup) C0034.m6044(C0014.m3365(C0018.m3916(C0022.m4453())), R.id.content), c0300cM30903, layoutParams);
                } catch (Exception e) {
                    C0049.m7975(e);
                }
                C0017.m3665(C0021.m4344(noticeM4254), 500);
                C0017.m3665(new o(noticeM4254, i), C0054.m8630(noticeM4254) * 1000);
                break;
            default:
                C0300c c0300cM30904 = C0013.m3090(noticeM4254);
                C0062.m9425();
                try {
                    C0018.m3892((ViewGroup) C0034.m6044(C0014.m3365(C0018.m3916(C0022.m4453())), R.id.content), c0300cM30904);
                    break;
                } catch (Exception e2) {
                    C0049.m7975(e2);
                }
        }
    }
}