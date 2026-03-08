package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiEqualizer: ImageVector
    get() {
        if (_SiEqualizer != null) {
            return _SiEqualizer!!
        }
        _SiEqualizer = ImageVector.Builder(
            name = "Regular.SiEqualizer",
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
                moveTo(2f, 12f)
                horizontalLineToRelative(4f)
                moveToRelative(4f, 0f)
                horizontalLineToRelative(4f)
                moveToRelative(4f, 0f)
                horizontalLineToRelative(4f)
                moveTo(2f, 16f)
                horizontalLineToRelative(4f)
                moveToRelative(4f, 0f)
                horizontalLineToRelative(4f)
                moveToRelative(4f, 0f)
                horizontalLineToRelative(4f)
                moveTo(2f, 20f)
                horizontalLineToRelative(4f)
                moveToRelative(4f, 0f)
                horizontalLineToRelative(4f)
                moveToRelative(4f, 0f)
                horizontalLineToRelative(4f)
                moveTo(2f, 8f)
                horizontalLineToRelative(4f)
                moveToRelative(12f, 0f)
                horizontalLineToRelative(4f)
                moveToRelative(-4f, -4f)
                horizontalLineToRelative(4f)
            }
        }.build()

        return _SiEqualizer!!
    }

@Suppress("ObjectPropertyName")
private var _SiEqualizer: ImageVector? = null
