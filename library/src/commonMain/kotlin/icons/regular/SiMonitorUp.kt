package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiMonitorUp: ImageVector
    get() {
        if (_SiMonitorUp != null) {
            return _SiMonitorUp!!
        }
        _SiMonitorUp = ImageVector.Builder(
            name = "Regular.SiMonitorUp",
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
                moveTo(9f, 20f)
                horizontalLineToRelative(6f)
                moveToRelative(-5f, -10f)
                lineToRelative(2f, -2f)
                moveToRelative(0f, 0f)
                lineToRelative(2f, 2f)
                moveToRelative(-2f, -2f)
                verticalLineToRelative(5f)
                moveTo(4.4f, 4f)
                horizontalLineToRelative(15.2f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 6.4f)
                verticalLineToRelative(8.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.4f, 2.4f)
                horizontalLineTo(4.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 14.6f)
                verticalLineTo(6.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.4f, 4f)
            }
        }.build()

        return _SiMonitorUp!!
    }

@Suppress("ObjectPropertyName")
private var _SiMonitorUp: ImageVector? = null
