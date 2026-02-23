package com.github.catvod.spider.merge.f0;

import android.app.Activity;
import android.view.View;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;

/* renamed from: com.github.catvod.spider.merge.f0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0303f implements View.OnClickListener {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f788short = {30457, 29127, 30735, 21268, 21112, 26673, 28943, 22484, -30736, 25707, 28286, 21293, 21788, -32504};

    public ViewOnClickListenerC0303f(Activity activity) {
    }

    /* renamed from: ۟۠ۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static short[] m8282() {
        if (C0054.m8557() < 0) {
            return f788short;
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            if (C0007.m1815(C0057.m8988(), C0046.m7718(m8282(), 0, 3, 2631))) {
                C0004.m1578(C0036.m6174(), C0002.m1316(C0035.m6110()));
            } else {
                C0038.m6417(C0035.m6110());
            }
        } catch (Exception e) {
            throw new RuntimeException(C0058.m9106(m8282(), 3, 11, 3117), e);
        }
    }
}