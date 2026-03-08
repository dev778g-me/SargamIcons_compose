package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiAddAlarm: ImageVector
    get() {
        if (_SiAddAlarm != null) {
            return _SiAddAlarm!!
        }
        _SiAddAlarm = ImageVector.Builder(
            name = "Regular.SiAddAlarm",
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
                moveTo(8f, 13f)
                horizontalLineToRelative(8f)
                moveToRelative(-4f, 4f)
                verticalLineTo(9f)
                moveToRelative(6f, -6f)
                lineToRelative(3f, 3f)
                moveTo(3f, 6f)
                lineToRelative(3f, -3f)
                moveToRelative(14f, 10f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
            }
        }.build()

        return _SiAddAlarm!!
    }

@Suppress("ObjectPropertyName")
private var _SiAddAlarm: ImageVector? = null
