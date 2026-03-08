package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiFilterList: ImageVector
    get() {
        if (_SiFilterList != null) {
            return _SiFilterList!!
        }
        _SiFilterList = ImageVector.Builder(
            name = "Duotone.SiFilterList",
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
                moveTo(6f, 12f)
                horizontalLineToRelative(12f)
                moveTo(4f, 8f)
                horizontalLineToRelative(16f)
                moveTo(8f, 16f)
                horizontalLineToRelative(8f)
            }
        }.build()

        return _SiFilterList!!
    }

@Suppress("ObjectPropertyName")
private var _SiFilterList: ImageVector? = null
