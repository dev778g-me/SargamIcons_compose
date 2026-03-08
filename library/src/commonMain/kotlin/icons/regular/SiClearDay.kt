package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiClearDay: ImageVector
    get() {
        if (_SiClearDay != null) {
            return _SiClearDay!!
        }
        _SiClearDay = ImageVector.Builder(
            name = "Regular.SiClearDay",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(12f, 4f)
                verticalLineTo(2f)
                moveToRelative(0f, 20f)
                verticalLineToRelative(-2f)
                moveToRelative(-8f, -8f)
                horizontalLineTo(2f)
                moveToRelative(20f, 0f)
                horizontalLineToRelative(-2f)
                moveTo(6.34f, 17.66f)
                lineToRelative(-1.41f, 1.41f)
                moveTo(19.07f, 4.93f)
                lineToRelative(-1.41f, 1.41f)
                moveToRelative(0f, 11.32f)
                lineToRelative(1.41f, 1.41f)
                moveTo(4.93f, 4.93f)
                lineToRelative(1.41f, 1.41f)
                moveTo(16f, 12f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, -8f, 0f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 0f)
                close()
            }
        }.build()

        return _SiClearDay!!
    }

@Suppress("ObjectPropertyName")
private var _SiClearDay: ImageVector? = null
