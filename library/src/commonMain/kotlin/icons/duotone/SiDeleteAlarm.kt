package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiDeleteAlarm: ImageVector
    get() {
        if (_SiDeleteAlarm != null) {
            return _SiDeleteAlarm!!
        }
        _SiDeleteAlarm = ImageVector.Builder(
            name = "Duotone.SiDeleteAlarm",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(12f, 21f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveToRelative(9.172f, 15.828f)
                lineToRelative(5.656f, -5.656f)
                moveToRelative(0f, 5.656f)
                lineToRelative(-5.656f, -5.656f)
                moveTo(18f, 3f)
                lineToRelative(3f, 3f)
                moveTo(3f, 6f)
                lineToRelative(3f, -3f)
                moveToRelative(14f, 10f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                close()
            }
        }.build()

        return _SiDeleteAlarm!!
    }

@Suppress("ObjectPropertyName")
private var _SiDeleteAlarm: ImageVector? = null
