package com.github.catvod.spider.merge.h0;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.x.C0015;

/* renamed from: com.github.catvod.spider.merge.h0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0312A implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0315D b;

    public /* synthetic */ RunnableC0312A(C0315D c0315d, int i) {
        this.a = i;
        this.b = c0315d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0314C c0314cM7551;
        switch (C0005.m1671(this)) {
            case 0:
                C0315D c0315dM6588 = C0040.m6588(this);
                if (C0031.m5643(c0315dM6588) != null && C0024.m4691(c0315dM6588) != null && (c0314cM7551 = C0045.m7551(c0315dM6588)) != null) {
                    try {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) C0041.m6774(c0314cM7551);
                        c0315dM6588.i = C0015.m3440(layoutParams) / C0059.m9192(c0315dM6588);
                        c0315dM6588.j = C0032.m5705(layoutParams) / C0018.m3953(c0315dM6588);
                        C0018.m3892((ViewGroup) C0030.m5434(C0031.m5643(c0315dM6588)), C0031.m5643(c0315dM6588));
                    } catch (Exception e) {
                        C0049.m7975(e);
                    }
                    c0315dM6588.d = false;
                    break;
                }
                break;
            case 1:
                C0315D c0315dM65882 = C0040.m6588(this);
                C0047.m7777(c0315dM65882);
                Activity activityM4453 = C0022.m4453();
                if (activityM4453 != null && !C0005.m1604(c0315dM65882)) {
                    c0315dM65882.c = activityM4453;
                    C0037.m6332(activityM4453, new ComponentCallbacksC0313B(c0315dM65882));
                    c0315dM65882.a = new com.github.catvod.spider.merge.W.A(c0315dM65882, 1, activityM4453);
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                    C0009.m2112(C0031.m5643(c0315dM65882), layoutParams2);
                    c0315dM65882.b = new C0314C(c0315dM65882, activityM4453);
                    int iM1048 = C0000.m1048(c0315dM65882);
                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iM1048, iM1048);
                    C0015.m3418(c0315dM65882);
                    float fM8039 = C0049.m8039(c0315dM65882);
                    int iM9192 = C0059.m9192(c0315dM65882);
                    int iM3007 = (int) (C0012.m3007(c0315dM65882) * C0018.m3953(c0315dM65882));
                    int iM1965 = C0008.m1965(0, C0051.m8186((int) (fM8039 * iM9192), iM9192 - iM1048));
                    layoutParams3.topMargin = C0008.m1965(0, C0051.m8186(iM3007, C0018.m3953(c0315dM65882) - iM1048));
                    layoutParams3.leftMargin = iM1965;
                    C0009.m2112(C0045.m7551(c0315dM65882), layoutParams3);
                    C0037.m6336(C0031.m5643(c0315dM65882), C0045.m7551(c0315dM65882));
                    C0065.m9726(activityM4453, C0031.m5643(c0315dM65882), layoutParams2);
                    c0315dM65882.d = true;
                    break;
                }
                break;
            default:
                C0315D c0315dM65883 = C0040.m6588(this);
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) C0041.m6774(C0045.m7551(c0315dM65883));
                c0315dM65883.i = C0015.m3440(layoutParams4) / C0059.m9192(c0315dM65883);
                c0315dM65883.j = C0032.m5705(layoutParams4) / C0018.m3953(c0315dM65883);
                C0015.m3418(c0315dM65883);
                float fM80392 = C0049.m8039(c0315dM65883);
                int iM91922 = C0059.m9192(c0315dM65883);
                int iM30072 = (int) (C0012.m3007(c0315dM65883) * C0018.m3953(c0315dM65883));
                int iM10482 = C0000.m1048(c0315dM65883);
                int iM19652 = C0008.m1965(0, C0051.m8186((int) (fM80392 * iM91922), iM91922 - iM10482));
                int iM19653 = C0008.m1965(0, C0051.m8186(iM30072, C0018.m3953(c0315dM65883) - iM10482));
                layoutParams4.leftMargin = iM19652;
                layoutParams4.topMargin = iM19653;
                C0009.m2112(C0045.m7551(c0315dM65883), layoutParams4);
                if (C0030.m5434(C0031.m5643(c0315dM65883)) == null) {
                    C0065.m9726(C0024.m4691(c0315dM65883), C0031.m5643(c0315dM65883), new FrameLayout.LayoutParams(-1, -1));
                    break;
                }
                break;
        }
    }
}