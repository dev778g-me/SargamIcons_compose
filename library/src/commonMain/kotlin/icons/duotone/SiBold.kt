package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiBold: ImageVector
    get() {
        if (_SiBold != null) {
            return _SiBold!!
        }
        _SiBold = ImageVector.Builder(
            name = "Duotone.SiBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(18.25f, 16f)
                curveToRelative(0f, -2.297f, -1.984f, -4.25f, -4.432f, -4.25f)
                horizontalLineTo(7.75f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(6.068f)
                curveToRelative(2.448f, 0f, 4.432f, -1.953f, 4.432f, -4.25f)
                moveToRelative(-3f, -9f)
                curveToRelative(0f, -1.755f, -1.52f, -3.25f, -3.5f, -3.25f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(4f)
                curveToRelative(1.98f, 0f, 3.5f, -1.495f, 3.5f, -3.25f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 3f)
                horizontalLineToRelative(4.75f)
                curveTo(14.1f, 3f, 16f, 4.788f, 16f, 7f)
                reflectiveCurveToRelative(-1.9f, 4f, -4.25f, 4f)
                horizontalLineTo(7f)
                horizontalLineToRelative(6.818f)
                curveTo(16.654f, 11f, 19f, 13.263f, 19f, 16f)
                reflectiveCurveToRelative(-2.346f, 5f, -5.182f, 5f)
                horizontalLineTo(7f)
                moveTo(7f, 3f)
                horizontalLineTo(5f)
                moveToRelative(2f, 0f)
                verticalLineToRelative(18f)
                moveToRelative(0f, 0f)
                horizontalLineTo(5f)
            }
        }.build()

        return _SiBold!!
    }

@Suppress("ObjectPropertyName")
private var _SiBold: ImageVector? = null
