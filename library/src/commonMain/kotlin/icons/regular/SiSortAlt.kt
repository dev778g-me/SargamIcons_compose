package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiSortAlt: ImageVector
    get() {
        if (_SiSortAlt != null) {
            return _SiSortAlt!!
        }
        _SiSortAlt = ImageVector.Builder(
            name = "Regular.SiSortAlt",
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
                moveTo(4f, 10f)
                horizontalLineToRelative(12f)
                moveTo(4f, 6f)
                horizontalLineToRelative(16f)
                moveTo(4f, 14f)
                horizontalLineToRelative(8f)
                moveToRelative(-8f, 4f)
                horizontalLineToRelative(4f)
            }
        }.build()

        return _SiSortAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiSortAlt: ImageVector? = null
