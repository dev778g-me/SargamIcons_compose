package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiPhoneCallback: ImageVector
    get() {
        if (_SiPhoneCallback != null) {
            return _SiPhoneCallback!!
        }
        _SiPhoneCallback = ImageVector.Builder(
            name = "Regular.SiPhoneCallback",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.172f, 5.586f)
                verticalLineToRelative(4.242f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(4.242f)
                moveToRelative(-4.242f, 0f)
                lineToRelative(5.656f, -5.656f)
                moveTo(7.181f, 10.269f)
                lineToRelative(6.503f, 6.462f)
                curveToRelative(0.697f, -0.808f, 5.11f, -5.539f, 7.316f, 0.923f)
                curveToRelative(0f, 0f, -0.232f, 3.346f, -4.994f, 3.346f)
                curveToRelative(-3.367f, 0f, -6.851f, -4.038f, -9.29f, -6.346f)
                curveTo(4.626f, 12.692f, 3f, 10.154f, 3f, 7.846f)
                curveTo(3f, 3.116f, 6.252f, 3f, 6.252f, 3f)
                curveToRelative(7.432f, 2.538f, 0.929f, 7.27f, 0.929f, 7.27f)
            }
        }.build()

        return _SiPhoneCallback!!
    }

@Suppress("ObjectPropertyName")
private var _SiPhoneCallback: ImageVector? = null
