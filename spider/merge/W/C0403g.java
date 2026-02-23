package com.github.catvod.spider.merge.w;

import androidx.core.view.ContentInfoCompat;
import androidx.core.view.OnReceiveContentViewBehavior;
import androidx.core.view.ViewCompat;
import com.github.catvod.spider.merge.d.C0047;

/* renamed from: com.github.catvod.spider.merge.w.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0403g implements OnReceiveContentViewBehavior {
    /* renamed from: ۣۣۡۤ, reason: not valid java name and contains not printable characters */
    public static ContentInfoCompat m9450(Object obj) {
        if (C0047.m7837() > 0) {
            return ViewCompat.a((ContentInfoCompat) obj);
        }
        return null;
    }

    public final ContentInfoCompat onReceiveContent(ContentInfoCompat contentInfoCompat) {
        return m9450(contentInfoCompat);
    }
}