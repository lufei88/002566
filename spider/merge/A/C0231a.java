package com.github.catvod.spider.merge.a;

import android.app.Notification;
import android.os.IBinder;
import android.os.Parcel;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.r.C0014;

/* renamed from: com.github.catvod.spider.merge.a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0231a implements c {
    public final IBinder b;

    public C0231a(IBinder iBinder) {
        this.b = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return C0065.m9756(this);
    }

    @Override // com.github.catvod.spider.merge.a.c
    public final void cancel(String str, int i, String str2) {
        Parcel parcelM4926 = C0026.m4926();
        try {
            C0002.m1248(parcelM4926, C0012.m2978());
            C0026.m4972(parcelM4926, str);
            C0033.m5818(parcelM4926, i);
            C0026.m4972(parcelM4926, str2);
            C0014.m3325(C0065.m9756(this), 2, parcelM4926, null, 1);
        } finally {
            C0063.m9495(parcelM4926);
        }
    }

    @Override // com.github.catvod.spider.merge.a.c
    public final void cancelAll(String str) {
        Parcel parcelM4926 = C0026.m4926();
        try {
            C0002.m1248(parcelM4926, C0012.m2978());
            C0026.m4972(parcelM4926, str);
            C0014.m3325(C0065.m9756(this), 3, parcelM4926, null, 1);
        } finally {
            C0063.m9495(parcelM4926);
        }
    }

    @Override // com.github.catvod.spider.merge.a.c
    public final void notify(String str, int i, String str2, Notification notification) {
        Parcel parcelM4926 = C0026.m4926();
        try {
            C0002.m1248(parcelM4926, C0012.m2978());
            C0026.m4972(parcelM4926, str);
            C0033.m5818(parcelM4926, i);
            C0026.m4972(parcelM4926, str2);
            if (notification != null) {
                C0033.m5818(parcelM4926, 1);
                C0056.m8922(notification, parcelM4926, 0);
            } else {
                C0033.m5818(parcelM4926, 0);
            }
            C0014.m3325(C0065.m9756(this), 1, parcelM4926, null, 1);
        } finally {
            C0063.m9495(parcelM4926);
        }
    }
}