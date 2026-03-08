package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiRemoveAlarm: ImageVector
    get() {
        if (_SiRemoveAlarm != null) {
            return _SiRemoveAlarm!!
        }
        _SiRemoveAlarm = ImageVector.Builder(
            name = "Regular.SiRemoveAlarm",
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
                moveToRelative(2f, -10f)
                lineToRelative(3f, 3f)
                moveTo(3f, 6f)
                lineToRelative(3f, -3f)
                moveToRelative(14f, 10f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
            }
        }.build()

        return _SiRemoveAlarm!!
    }

@Suppress("ObjectPropertyName")
private var _SiRemoveAlarm: ImageVector? = null
